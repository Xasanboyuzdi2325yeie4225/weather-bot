package org.example;

import org.example.btns.InterfaceBtns;
import org.example.btns.InterfaceBtnsIMPL;
import org.example.ob_havo.obHavo.Ob_Havo;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Controller extends TelegramLongPollingBot {
    private final String TOKEN="BOT_TOKEN";
    private final String USERNAME="BOT_USERNAME";
    private final InterfaceBtns btns=new InterfaceBtnsIMPL();
    private final Resource resource=new Resource();
    private final Ob_Havo obHavo=new Ob_Havo();



    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();
                if (text.equals("/start") || text.equals("Bosh menu")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(message.getChatId());
                    sendMessage.setText("qulay bo`lgan bo`limni tanlang");
                    sendMessage.setReplyMarkup(btns.btnKeyboardBTN(resource.getMenu()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                } else if (text.equals("viloyatlar bo`yicha")) {
                    System.out.println("viloyatlar bo`yicha");
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(message.getChatId());
                    sendMessage.setText("viloyatlardan birini tanlang");
                    sendMessage.setReplyMarkup(btns.btnKeyboardBTN(resource.getViloyatlar()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                } else if (resource.viloyatmi(text)) {
                    System.out.println("viloyatlarmi");
                    try {
                        execute(resource.obhavoVil(text, message.getChatId()));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (text.equals("lokatsiya bo`yicha")) {
                    System.out.println(text);
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(update.getMessage().getChatId());
                    sendMessage.setText("lokatsiyangizni yuboring");
                    sendMessage.setReplyMarkup(btns.locationBTN());
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
                 else if (message.hasLocation()) {
                System.out.println("location");
                Double latitude=message.getLocation().getLatitude();
                Double longitude=message.getLocation().getLongitude();
//                    System.out.println(text);
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(message.getChatId());
                    sendMessage.setText(obHavo.getObHavo(latitude,longitude));
                    sendMessage.setReplyMarkup(btns.btnKeyboardBTN(resource.getBosh()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }

            }
        }
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public String getBotUsername() {
        return USERNAME;
    }
}
