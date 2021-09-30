public class DOCHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Открыт документ формата DOC");
    }

    @Override
    public void create() {
        System.out.println("Создан документ формата DOC");
    }

    @Override
    public void change() {
        System.out.println("Изменен документ формата DOC");
    }

    @Override
    public void save() {
        System.out.println("Сохранен документ формата DOC");
    }
}
