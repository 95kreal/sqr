import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int count = service.numbersRange(200, 300);
        System.out.println(count);
    }
}
