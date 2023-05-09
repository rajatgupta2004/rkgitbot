import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cbot extends TelegramLongPollingBot {

    // Map to store the selected year of each user
    private HashMap<Long, String> selectedYearMap = new HashMap<Long, String>();
    private HashMap<Long , String> selectedSubject = new HashMap<Long, String>();
    
    public static void main(String[] args) throws TelegramApiException {
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
 	    telegramBotsApi.registerBot(new Cbot());
		 
		 
	}
    
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        System.out.println(message.getText());
        

        // Check if the user sent the /start command
        if (message != null && message.hasText() && message.getText().equals("/start")) {
            // Send a message asking the user to select their year
            SendMessage selectYearMessage = new SendMessage();
            selectYearMessage.setChatId(message.getChatId());
            selectYearMessage.setText("HELLO BRO ");
            
            
          
            
            selectYearMessage.setReplyMarkup(getYearReplyKeyboard());
            
            try {
                execute(selectYearMessage);
                selectYearMessage.setText("Select your year:");
                execute(selectYearMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        } else if (message != null && message.hasText()) {
            // Handle the user's selection
            String text = message.getText();

            // Check if the user selected a year
            if (text.equals("First") ) {
                // Store the selected year for this user
                selectedYearMap.put(message.getChatId(), text);

                // Send a message asking the user to select a subject
                SendMessage selectSubjectMessage = new SendMessage();
                		selectSubjectMessage.setChatId(message.getChatId());
                		selectSubjectMessage.setText("Select a subject:");
                		selectSubjectMessage.setReplyMarkup(getFirstSubjectReplyKeyboard());
                try {
                    execute(selectSubjectMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if ( text.equals("Second") ) {
                // Store the selected year for this user
                selectedYearMap.put(message.getChatId(), text);

                // Send a message asking the user to select a subject
                SendMessage selectSubjectMessage = new SendMessage();
                		selectSubjectMessage.setChatId(message.getChatId());
                		selectSubjectMessage.setText("Select a subject:");
                		selectSubjectMessage.setReplyMarkup(getSecondSubjectReplyKeyboard());
                try {
                    execute(selectSubjectMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (text.equals("Third")) {
                // Store the selected year for this user
                selectedYearMap.put(message.getChatId(), text);

                // Send a message asking the user to select a subject
                SendMessage selectSubjectMessage = new SendMessage();
                		selectSubjectMessage.setChatId(message.getChatId());
                		selectSubjectMessage.setText("Select a subject:");
                		selectSubjectMessage.setReplyMarkup(getThirdSubjectReplyKeyboard());
                try {
                    execute(selectSubjectMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                
            }
            else if (text.equals("Maths")) {
                // Send a message with the Maths notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}
         
               
                  
            } else if (text.equals("Electrical")) {
                // Send a message with the Electrical notes link for the selected year
               
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}
         
       
                
                
                
                
            } else if (text.equals("Pps")) {
                // Send a message with the PPS notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}    
            }else if (text.equals("Soft skill")) {
                // Send a message with the PPS notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}    
            }else if (text.equals("Electronics")) {
                // Send a message with the PPS notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}    
            }else if (text.equals("Evs")) {
                // Send a message with the PPS notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}    
            }else if (text.equals("Physics")) {
                // Send a message with the PPS notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}    
            }else if (text.equals("Chemistry")) {
                // Send a message with the PPS notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select a Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}    
            }else if (text.equals("Mechanics")) {
                // Send a message with the PPS notes link for the selected year
            	selectedSubject.put(message.getChatId(), text);
            	
            	SendMessage selectSubjectMessage = new SendMessage();
         		selectSubjectMessage.setChatId(message.getChatId());
         		selectSubjectMessage.setText("Select Material:");
         		selectSubjectMessage.setReplyMarkup(getMaterial());
         		try {
         			execute(selectSubjectMessage);
         		} catch (Exception e) {
         			e.printStackTrace();
         		}    
            }else if (text.equals("Notes")) {
                // Send a message with the PPS notes link for the selected year
            	String Year = selectedYearMap.get(message.getChatId());
            	String Subject = selectedSubject.get(message.getChatId());
            	
            	System.out.println("YEAR "+Year+" Subject "+ Subject );
            	
            	if(Year.equals("First")) {
            		if(Subject.equals("Maths")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Maths Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Physics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			 
            			
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Chemistry")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Chemistry Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Electronics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Electronics Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Mechanics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Mechanics Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Electrical")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Electrical Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Soft skill")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Soft skill Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Evs")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Evs Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Pps")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Pps Notes Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}
            		
            		
            	}else if(Year.equals("Second")){
            		
            		
            	}else if(Year.equals("Third")){
            		
            	}
            	
            	
            	
            	   
            }else if (text.equals("Pyq")) {
                // Send a message with the PPS notes link for the selected year
            	String Year = selectedYearMap.get(message.getChatId());
            	String Subject = selectedSubject.get(message.getChatId());
            	
            	
            	if(Year.equals("First")) {
            		if(Subject.equals("Maths")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Maths Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Physics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Physics Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Chemistry")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Chemistry Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Electronics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Electronics Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Mechanics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Mechanics Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Electrical")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Electrical Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Soft skill")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Soft skill Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Evs")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Evs Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Pps")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Pps Pyq Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}
            		
            		
            	}else if(Year.equals("Second")){
            		
            		
            	}else if(Year.equals("Third")){
            		
            	}
            	
            	
            	 
            }else if (text.equals("Assignment")) {
                // Send a message with the PPS notes link for the selected year
            	String Year = selectedYearMap.get(message.getChatId());
            	String Subject = selectedSubject.get(message.getChatId());
            	
            	
            	if(Year.equals("First")) {
            		if(Subject.equals("Maths")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Maths Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Physics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Physics Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Chemistry")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Chemistry Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Electronics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Electronics Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Mechanics")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Mechanics Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Electrical")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Electrical Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Soft skill")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Soft skill Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Evs")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Evs Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}else if(Subject.equals("Pps")) {
            			SendMessage sms = new SendMessage();
            			sms.setChatId(message.getChatId());
            			sms.setText("Pps Assignment Given below");
                 		try {
                 			sms.setText("Unit 1 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 2 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 3 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 4 : [Link]");
                 			execute(sms);
                 			sms.setText("Unit 5 : [Link]");
                 			execute(sms);
                 		} catch (Exception e) {
                 			e.printStackTrace();
                 		}
            			
            		}
            		
            		
            	}else if(Year.equals("Second")){
            		
            		
            	}else if(Year.equals("Third")){
            		
            	}    
            }           
            
            
            
        } 
                    
                }
                
                public static ReplyKeyboardMarkup getFirstSubjectReplyKeyboard() {
                    ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                    ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

                    KeyboardRow row1 = new KeyboardRow();
                    row1.add("Electrical");

                    KeyboardRow row2 = new KeyboardRow();
                    row1.add("Electronics");

                    KeyboardRow row3 = new KeyboardRow();
                  
                    row1.add("Maths");
                   
                    row2.add("Soft skill");

                    row2.add("Evs");

                    row2.add("Physics");
                    
                    row3.add("Chemistry");

                    row3.add("pps");

                    row3.add("Mechanics");
                    
                    
                   

                    keyboard.add(row1);
                    keyboard.add(row2);
                    keyboard.add(row3);

                    markup.setKeyboard(keyboard);
                    markup.setResizeKeyboard(true);
                   

                    return markup;
                }
                public static ReplyKeyboardMarkup getSecondSubjectReplyKeyboard() {
                    ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                    ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

                    KeyboardRow row1 = new KeyboardRow();
                    row1.add("Maths");

                    KeyboardRow row2 = new KeyboardRow();
                    row2.add("Electrical");

                    KeyboardRow row3 = new KeyboardRow();
                    row3.add("pps");

                    keyboard.add(row1);
                    keyboard.add(row2);
                    keyboard.add(row3);

                    markup.setKeyboard(keyboard);
                    markup.setResizeKeyboard(true);
               

                    return markup;
                }
                public static ReplyKeyboardMarkup getThirdSubjectReplyKeyboard() {
                    ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                    ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

                    KeyboardRow row1 = new KeyboardRow();
                    row1.add("Maths");

                    KeyboardRow row2 = new KeyboardRow();
                    row2.add("Electrical");

                    KeyboardRow row3 = new KeyboardRow();
                    row3.add("pps");

                    keyboard.add(row1);
                    keyboard.add(row2);
                    keyboard.add(row3);

                    markup.setKeyboard(keyboard);
                    markup.setResizeKeyboard(true);
               

                    return markup;
                }
                
                public static ReplyKeyboardMarkup getMaterial() {
                    ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                    ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

                    KeyboardRow row1 = new KeyboardRow();
                    row1.add("Notes");

                    KeyboardRow row2 = new KeyboardRow();
                    row2.add("Pyq");

                    KeyboardRow row3 = new KeyboardRow();
                    row3.add("Assignment");

                    keyboard.add(row1);
                    keyboard.add(row2);
                    keyboard.add(row3);

                    markup.setKeyboard(keyboard);
                    markup.setResizeKeyboard(true);
                  

                    return markup;
                }
                
                public static ReplyKeyboardMarkup getYearReplyKeyboard() {
                    ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                    ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();

                    KeyboardRow row1 = new KeyboardRow();
                    row1.add("First");

                    KeyboardRow row2 = new KeyboardRow();
                    row2.add("Second");

                    KeyboardRow row3 = new KeyboardRow();
                    row3.add("Third");

                    keyboard.add(row1);
                    keyboard.add(row2);
                    keyboard.add(row3);

                    markup.setKeyboard(keyboard);
                    markup.setResizeKeyboard(true);
                   

                    return markup;
                }
              
                public String getBotUsername() {
                    // Return your bot's username
                    return "rkgitArchivesbot";
                }

                @Override
                public String getBotToken() {
                    // Return your bot's token
                    return "6088662467:AAH-fS6x0V8r7Ie3Lzb4EvzQllK0SgOX5XE";
                }
            }
	
	