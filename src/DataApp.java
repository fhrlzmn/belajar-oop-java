public class DataApp {
    public static void main(String[] args) {
        var data = new Data();
        var secondData = new SecondData();
        var thirdData = new ThirdData();

        System.out.println(data.getValue());
        System.out.println(secondData.getValue());
        System.out.println(secondData.getParentValue());
        System.out.println(thirdData.getValue());
        System.out.println(thirdData.getParentValue());
    }
}
