package domain;

import java.util.Date;

public class Post {
    private int id;
    private Date dateCreated;
    private Date dateModified;
    private TitleInfo title;
    private FavoriteInfo favorite; // избранное
    private String preview; // текст в ленте
    private String text; // полный текст
    private String url; // постоянная ссылка на пост
    private LikesInfo likes; //лайки
    private CommentsInfo comments;  // комментарии
    private RepostInfo repost;  // репост
    private int views;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public TitleInfo getTitle() {
        return title;
    }

    public void setTitle(TitleInfo title) {
        this.title = title;
    }

    public FavoriteInfo getFavorite() {
        return favorite;
    }

    public void setFavorite(FavoriteInfo favorite) {
        this.favorite = favorite;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public void setLikes(LikesInfo likes) {
        this.likes = likes;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public void setComments(CommentsInfo comments) {
        this.comments = comments;
    }

    public RepostInfo getRepost() {
        return repost;
    }

    public void setRepost(RepostInfo repost) {
        this.repost = repost;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
