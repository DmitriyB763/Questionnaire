public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 №444444";
        post.phone = "+79277614167";
        post.subscription = true;

        post.birthday = new FormDate(); // создал экземпляр класса FormDate  содержащий в себе поля с датой , месяцем и годом рождения
        post.birthday.day = 13;  // у класса post вызываю поле birthday  у которого вызываю параметр day  присваиваю значение
        post.birthday.month = 24;
        post.birthday.year = 1996;
    }


}
