import java.text.NumberFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class Factory {
    public static void main(String[] args) {
        Calendar.getInstance();
        NumberFormat.getInstance();
        List.of(1, 2, 3, 4);
        Stream.of(1, 2, 3, 4);
        Integer.valueOf("1234");

    }
}

// type 1: dont have to use the constructor of product itself, we can use a
// factory method to instantiate.
interface Product {

}

class Mp3File implements Product {

}

class PhysicalCD implements Product {

}

class PhysicalCategory {
    public Product newProduct() {
        return new PhysicalCD();
    }
}

class DigitalCategory {
    public Product newProduct() {
        return new Mp3File();
    }
}

// type 2
interface Product2 {

}

class StandardProduct2 implements Product2 {

}

class DigitalProduct2 implements Product2 {

}

class PhysicalProduct2 implements Product2 {

}

class Category2 {
    public Product2 newProduct2(int type) {
        switch (type) {
            case 1:
                return new StandardProduct2();
            case 2:
                return new DigitalProduct2();
            case 3:
                return new PhysicalProduct2();
            default:
                throw new IllegalArgumentException();
        }
    }
}

// type 3
interface Product3 {

}

class DigitalProduct3 implements Product3 {

}

class PhysicalProduct3 implements Product3 {

}

interface Category3 {
    Product3 newProduct();
}

class Digital3 implements Category3 {
    @Override
    public Product3 newProduct() {
        return new DigitalProduct3();
    }
}

class Physical3 implements Category3 {
    @Override
    public Product3 newProduct() {
        return new PhysicalProduct3();
    }
}
