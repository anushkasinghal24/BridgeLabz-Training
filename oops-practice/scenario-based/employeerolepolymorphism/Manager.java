package employeerolepolymorphism;
//Manager subclass
class Manager extends Employee{
 private final double bonus; // cached bonus

 public Manager(String name, double salary) {
     super(name, salary) ;
     this.bonus = salary *  0.10; // 10% bonus
 }

 @Override
 public double getBonus(){
     return bonus;
 }
}
