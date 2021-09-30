public class XMLHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Открыт документ формата XML");
    }

    @Override
    public void create() {
        System.out.println("Создан документ формата XML");
    }

    @Override
    public void change() {
        System.out.println("Изменен документ формата XML");
    }

    @Override
    public void save() {
        System.out.println("Сохранен документ формата XML");
    }
}
