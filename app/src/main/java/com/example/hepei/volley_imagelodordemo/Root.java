package com.example.hepei.volley_imagelodordemo;

import java.util.List;

/**
 * Created by hepei on 2016/12/26.
 */

public class Root {
    private Data data;

    private Status status;

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return this.data;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public class Photo {
        private String small;

        private String thumb;

        private String url;

        public void setSmall(String small) {
            this.small = small;
        }

        public String getSmall() {
            return this.small;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getThumb() {
            return this.thumb;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return this.url;
        }

    }

    public class Player {
        private Photo photo;

        private String url;

        private String description;

        private String action;

        private int action_id;

        public void setPhoto(Photo photo) {
            this.photo = photo;
        }

        public Photo getPhoto() {
            return this.photo;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return this.url;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getAction() {
            return this.action;
        }

        public void setAction_id(int action_id) {
            this.action_id = action_id;
        }

        public int getAction_id() {
            return this.action_id;
        }

    }

    public class Img {
        private String small;

        private String thumb;

        private String url;

        public void setSmall(String small) {
            this.small = small;
        }

        public String getSmall() {
            return this.small;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getThumb() {
            return this.thumb;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return this.url;
        }

    }

    public class Promote_goods {
        private String id;

        private String name;

        private String market_price;

        private String shop_price;

        private String promote_price;

        private String brief;

        private Img img;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setMarket_price(String market_price) {
            this.market_price = market_price;
        }

        public String getMarket_price() {
            return this.market_price;
        }

        public void setShop_price(String shop_price) {
            this.shop_price = shop_price;
        }

        public String getShop_price() {
            return this.shop_price;
        }

        public void setPromote_price(String promote_price) {
            this.promote_price = promote_price;
        }

        public String getPromote_price() {
            return this.promote_price;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getBrief() {
            return this.brief;
        }

        public void setImg(Img img) {
            this.img = img;
        }

        public Img getImg() {
            return this.img;
        }

    }

    public class Data {
        private List<Player> player;

        private List<Promote_goods> promote_goods;

        public void setPlayer(List<Player> player) {
            this.player = player;
        }

        public List<Player> getPlayer() {
            return this.player;
        }

        public void setPromote_goods(List<Promote_goods> promote_goods) {
            this.promote_goods = promote_goods;
        }

        public List<Promote_goods> getPromote_goods() {
            return this.promote_goods;
        }

    }

    public class Status {
        private int succeed;

        public void setSucceed(int succeed) {
            this.succeed = succeed;
        }

        public int getSucceed() {
            return this.succeed;
        }

    }

}

