import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));

        balls.forEach(System.out::println);
    }

    static class Ball {
        String colors;

        public Ball(String colors) {
            this.colors = colors;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(colors, ball.colors);
        }

        @Override
        public int hashCode() {
            return Objects.hash(colors);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "colors='" + colors + '\'' +
                    '}';
        }
    }
}
