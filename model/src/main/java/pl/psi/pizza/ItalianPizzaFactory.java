package pl.psi.pizza;

class ItalianPizzaFactory extends AbstractPizzaFactory{

    @Override
    protected Pizza createPizzaInstance(String aName) {
        final Pizza pizza = new Pizza(aName, PizzaPieType.ITALIAN);
        return pizza;
    }
}
