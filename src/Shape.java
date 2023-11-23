public class Shape {
    private Location location;
    private String color;
    private boolean isTranpatet;

    public Shape(Location location, String color, boolean isTranpatet) {
        this.location = location;
        this.color = color;
        this.isTranpatet = isTranpatet;
    }
    public String speak(){
        return "Shape color " + color + ", расположена в точке ( " + location.getX() + ", " + location.getY()+ ").";
    }
}

