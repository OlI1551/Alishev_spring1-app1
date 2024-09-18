package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);
        System.out.println(music.getSong());
        Music music1 = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(music1.getSong());
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playMusic(music);
        musicPlayer.playMusic(music1);
//        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        Music music = context.getBean("musicBean", Music.class);
        // получаем bean (объект) с нужным id, из нужного нам класса
        // когда мы получили объект нужного нам класса TestBean давайте положим его в какую-нибудь переменную
//        MusicPlayer musicPla yer = new MusicPlayer(music);
//        System.out.println(te stBean.getName());
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusicList();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        // сравнение по указателям - указывают ли два объекта на один и тот же участок памяти
//        // в данном случае нам не важно содержание объектов - поэтому не equals
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        // будет вызван метод toString по умолчанию и выведет на экран хэш объекта
//        // если хэши совпадают - это означает, что это один и тот же объект
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());


        // после того, как мы поработали с Application context, мы должны его обязательно закрыть
        context.close();

    }
}
