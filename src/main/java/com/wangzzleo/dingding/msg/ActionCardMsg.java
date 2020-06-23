package com.wangzzleo.dingding.msg;

public class ActionCardMsg extends BaseDingDingMsg {

    private ActionCard actionCard;
    private String title;
    private String text;
    private String singleTitle;
    private String singleURL;
    private String btnOrientation;

    public ActionCard getActionCard() {
        return actionCard;
    }

    public void setActionCard(ActionCard actionCard) {
        this.actionCard = actionCard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSingleTitle() {
        return singleTitle;
    }

    public void setSingleTitle(String singleTitle) {
        this.singleTitle = singleTitle;
    }

    public String getSingleURL() {
        return singleURL;
    }

    public void setSingleURL(String singleURL) {
        this.singleURL = singleURL;
    }

    public String getBtnOrientation() {
        return btnOrientation;
    }

    public void setBtnOrientation(String btnOrientation) {
        this.btnOrientation = btnOrientation;
    }

    private static class ActionCard {
        private String title;
        private String text;
        private String singleTitle;
        private String singleURL;
        private String btnOrientation;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSingleTitle() {
            return singleTitle;
        }

        public void setSingleTitle(String singleTitle) {
            this.singleTitle = singleTitle;
        }

        public String getSingleURL() {
            return singleURL;
        }

        public void setSingleURL(String singleURL) {
            this.singleURL = singleURL;
        }

        public String getBtnOrientation() {
            return btnOrientation;
        }

        public void setBtnOrientation(String btnOrientation) {
            this.btnOrientation = btnOrientation;
        }
    }

}
