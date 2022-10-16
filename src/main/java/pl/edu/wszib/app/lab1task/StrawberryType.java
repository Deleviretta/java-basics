package pl.edu.wszib.app.lab1task;

public enum StrawberryType implements Cechowalny{
    ANANASOWA("biale owoce") {
        @Override
        public String cecha() {
            return null;
        }
        //there won't be access to this method
        public void test() {}
    }, HOENYONE("wyrazista"), POLKA("najsmaczniejsza"),
    KENT("Dla fanow slodyczy"), CHRISTINE("Zaowocuje szybko i obficie");

    private final String type;
    StrawberryType(final String trait) {
        this.type = trait;
    }

    public String getType() {
        return type;
    }


    @Override
    public String cecha() {
        return null;
    }
}
