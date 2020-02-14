import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AnimalTest {



        Dog dog = new Dog();

        Cat cat = new Cat();

        @Test
        public void TestDogSound(){


            assertEquals(dog.sounds(),"Barks" );
        }

        @Test
        public void TestDogEats(){


            assertEquals(dog.eats(),"Food" );
        }

        @Test
        public void TestCatSound(){


            assertEquals(cat.sounds(),"Food" );
        }

        @Test
        public void TestCatEats(){


            assertEquals(cat.eats(),"Food" );
        }

   }
