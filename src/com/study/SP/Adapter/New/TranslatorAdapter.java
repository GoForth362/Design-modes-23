package com.study.SP.Adapter.New;

public class TranslatorAdapter implements EnglishSpeaker{
    private Chinese adapter;

    public TranslatorAdapter (Chinese adapter) {
        this.adapter = adapter;
    }

    @Override
    public void speakEnglish() {
        adapter.speakChinese();
        System.out.println("Hello World");
    }
}


