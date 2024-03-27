public class Programmer {
    private String name, company, position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    String getPosition() {
            return position;
        }

    public String work() {
           switch (position) {
               case "intern" :
                   position = "junior";
                   break;
               case "junior" :
                   position = "middle";
                   break;
               case "middle":
                   position = "senior";
                   break;
               case "senior":
                   position = "lead";
                   break;
           }
           return position;
    }

}

/*private String name;
    private String company;
    private String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    String getPosition() {
        return position;
    }
    public void work() {
        switch (position) {
            case "intern" :
                position = "junior";
                break;
            case "junior" :
                position = "middle";
                break;
            case "middle" :
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }*/
