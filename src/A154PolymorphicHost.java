//主人类
public class A154PolymorphicHost {
    //这种没有使用多态
    // 存在缺点：Host和Cat，Dog的关联性很强。扩展力差，因为只要加一个新的宠物，Host就要加一个新方法
    /*public void feed(A154PolymorphicCat cat) {//主人要喂
        cat.eat();
    }
    public void feed(A154PolymorphicDog dog) {//主人要喂
        dog.eat();
    }*/

    //使用多态,降低程序的耦合度，提高程序的扩展力
    public void feed(A154PolymorphicPet pet) {//主人要喂
            pet.eat();
            }
}
