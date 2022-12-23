import java.lang.reflect.Array;
import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() throws InstantiationException, IllegalAccessException {
//        Reflections reflections = new Reflections("com.my.project");
//
//        Set<Class<?>> subTypes =
//                reflections.get(SubTypes.of(SomeType.class).asClass());
//
//        Set<Class<?>> annotated =
//                reflections.get(SubTypes.of(TypesAnnotated.with(SomeAnnotation.class)).asClass());

        Class<?>[] characters = {Hobbit.class, King.class, Knight.class, Elf.class};
        Random rd = new Random();
        return (Character) characters[rd.nextInt(4)].newInstance();
    }
}
