package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String startWork_error = _validateStartWork(r.getStartWork());
        if(!startWork_error.equals("")) {
            errors.add(startWork_error);
        }

        String finishWork_error = _validateFinishWork(r.getFinishWork());
        if(!finishWork_error.equals("")) {
            errors.add(finishWork_error);

        }

        return errors;
    }


    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
            }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
            }

        return "";
    }

    private static String _validateStartWork(String startWork) {
        if(startWork == null || startWork.equals("")) {
            return "出勤時間を入力してください。";
            }

        return "";
    }

    private static String _validateFinishWork(String finishWork) {
        if(finishWork == null || finishWork.equals("")) {
            return "退勤時間を入力してください。";
            }

        return "";
    }

}