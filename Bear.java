public class Bear extends Monster {
    public Bear() {
        super(3, "Ayı", 7, 20, 12);
        System.out.println("A Bear has been created!");
        System.out.println("ID: 3");
        System.out.println("Name: Ayı");
        System.out.println("Damage: 7");
        System.out.println("Health: 20");
        System.out.println("Award: 12");
    }

    public static void main(String[] args) {
        
        new Bear();
    }
}
    

//completed