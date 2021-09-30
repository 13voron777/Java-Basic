public class TXTHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Открыт документ формата TXT");
    }

    @Override
    public void create() {
        System.out.println("Создан документ формата TXT");
    }

    @Override
    public void change() {
        System.out.println("Изменен документ формата TXT");
    }

    @Override
    public void save() {
        System.out.println("Сохранен документ формата TXT");
    }
}
