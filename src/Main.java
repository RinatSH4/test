import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] s1 = {"В первую очередь ",
                "С другой стороны ",
                "Таким образом ",
                "Мы уверены, что ",
                "Наш опыт показывает ",
                "Менторы советуют "};
        String[] s2 = {"выполнение поставленных KPI ",
                "архитектура сервиса ",
                "новая бизнес-модель ",
                "дальнейшее масштабирование ",
                "сбор юзер кейсов ",
                "своевременный деплой "};
        String[] s3 = {"играет важную роль в формировании ",
                "требует от нас анализа ",
                "требует пересмотра ",
                "способствует подготовке и реализации ",
                "обеспечивает ключевым сотрудникам участие в формировании ",
                "позволяет выполнить важные задачи "};
        String[] s4 = {"безнес стратегии.",
                "ключевых метрик.",
                "маркетинговой стратегии.",
                "продуктивной стратегии.",
                "нового видения.",
                "нового подхода в реализации фич."};

        Random r = new Random();
        String result = s1[r.nextInt(0, s1.length)] +
                s2[r.nextInt(0, s2.length)] +
                s3[r.nextInt(0, s3.length)] +
                s4[r.nextInt(0, s4.length)];

        System.out.println(result);

    }
}
