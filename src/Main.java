import java.util.Scanner;
import java.util.Random;
public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        final int NUMBER_USER=5;
        String [] nameUser= new String[5];
        String  name1;
        int [] userResult= new int[5];
        int counter = 0;
        int numberCounter = 10;
        int gutCounter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (i<NUMBER_USER){
            System.out.println(" Уважаемый пользователь, если Вы хотите принять участие в опросе,");
            System.out.println("то введите пожалуйста Ваше имя : ");
            nameUser[i]= scanner.nextLine(); i++;
        }
        System.out.println(" Итак в опросе зарегистрировалось "+i+" пользователей :");
        i=0;
        while (i<5){
            // nameUser[i]= scanner.nextLine(); i++;
            System.out.println(i+1+" ый пользователь :" +nameUser[i]);
            i++;

        }

        System.out.println("Желаем Вам успешно пройти опрос !!!");

        System.out.println(" counter= " + counter);
        System.out.println(" counter= " + counter);
        System.out.println(" У Вас будет ровно - " + numberCounter + " попыток.");
        i=0;
        while (i<NUMBER_USER){
            System.out.println(" Уважаемый пользователь "+nameUser[i]+" ответьте пожалуйста на наши вопросы !");
            counter=0; gutCounter=0;
            while(counter < numberCounter) {
                ++counter;
                int a = random.nextInt(99) + 1;
                int b = random.nextInt(99) + 1;
                System.out.println("Уважаемый пользователь "+nameUser[i]+" Ваша " + counter + " ая попытка.");
                System.out.println(" Сумма числа a= " + a + " ,и числа b =" + b);
                System.out.println(" Введите результат суммы :");
                int sum = scanner.nextInt();
                if (sum == a + b) {
                    System.out.println(" Ответ правильный !");
                    ++gutCounter;
                } else {
                    System.out.println(" Ответ НЕ правильный ! Попробуйте еще раз");
                }
            }
            System.out.println(nameUser[i]+" Из " + numberCounter + " вопросов.Вы правильно ответили на - " + gutCounter);
            double result = 5.0 * (double)gutCounter / (double)counter;
            userResult[i]=(int)Math.round(result);
            System.out.println(nameUser[i]+"Ваша оценка  " + userResult[i]); i++;
        }
        System.out.println("Итак ИТОГ конкурса :"); i=0;
        while(i<NUMBER_USER){
            System.out.println(nameUser[i]+" получает оценку :"+userResult[i]); i++;
        }
        System.out.println("Всем участникам спасибо, до новых всереч !!!");
        int n=NUMBER_USER; int k;
        for( i=0;i<NUMBER_USER;i++){
            for(int j=0; j<n-1;j++){
                if(userResult[j]>userResult[j+1]){
                    k=userResult[j]; userResult[j]=userResult[j+1]; userResult[j+1]=k;
                    name1=nameUser[j];nameUser[j]=nameUser[j+1]; nameUser[j+1]=name1;
                }
            }
            n=n-1;
        }
        System.out.println("Итак ОКОНЧАТЕЛЬНЫЙ РЕЗУЛЬТАТ конкурса :"); i=0;
        while(i<NUMBER_USER){
            i++; System.out.println(nameUser[NUMBER_USER-i]+" получает оценку :"+userResult[NUMBER_USER-i]);
        }
    }
}
