package com.study.SP.Adapter.New;

public class Main {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        EnglishSpeaker adapter = new TranslatorAdapter(chinese);
        adapter.speakEnglish();
    }
}
