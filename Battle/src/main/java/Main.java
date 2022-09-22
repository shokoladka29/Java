import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    static class GameCharacter{
        String name;
        int hp;
        int maxHp;
        int attackPower;
        boolean block;

        public GameCharacter(String name, int maxHp, int attackPower){
            this.name = name;
            this.maxHp = maxHp;
            this.hp = this.maxHp;
            this.attackPower = attackPower;
            this.block = false;
        }
        public void attack(GameCharacter target) {
            int damage = this.attackPower;
            if (target.block == true) {
                if (Math.random() < 0.75) {
                    System.out.println(target.name + " повністю заблокував атаку ");
                    return;
                }   else {
                        damage *= 2;
                }
            }
            target.hp -= damage;
            System.out.println(this.name + " наніс персонажу " + target.name + " шкоди " + damage);
            System.out.println("У персонажа " + target.name + " залишилось " + target.hp + " / " + target.maxHp + " од. здоров'я");
        }

        public void blockAction() {
            hp++;
            if (hp > maxHp) {
                hp = maxHp;
            }
            block = true;
            System.out.println(this.name + " пробує заблокувати наступну атаку. Отримує +1 од. здоров'я ");
        }

        public void reset() {
            block = false;
        }
    }


    public static void main(String[] args) {
        GameCharacter droid1 = new GameCharacter("Джон",10, 3 );
        GameCharacter droid2 = new GameCharacter("Пітер", 9, 4);

        System.out.println("Битва почалась!");

        while (true){
            System.out.println("\nХід гравця: " + droid1.name);
            System.out.println(" Які будуть ваші дії?");
            droid1.reset();
            String input = sc.next();
            if (input.equals("/ударити")){
                droid1.attack(droid2);
                if (droid2.hp <= 0){
                    System.out.println(droid1.name + " переміг персонажа " + droid2.name);
                    break;
                }
            } else if (input.equals("/блок")) {
                droid1.blockAction();
            }

            System.out.println("\nХід гравця: " + droid2.name);
            droid2.reset();
            if (Math.random() < 0.5) {
                droid2.attack(droid1);
                if (droid1.hp <= 0) {
                    System.out.println(droid2.name + " переміг персонажа " + droid1.name);
                    break;
                }
            }
        }
        System.out.println("Кінець гри!");
    }
}
