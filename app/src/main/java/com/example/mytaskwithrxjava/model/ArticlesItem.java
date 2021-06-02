package com.example.mytaskwithrxjava.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticlesItem {
	@SerializedName("url")
	private String url;

	@SerializedName("uri")
	private String uri;

	@SerializedName("id")
	private long id;

	@SerializedName("asset_id")
	private long assetId;

	@SerializedName("source")
	private String source;

	@SerializedName("published_date")
	private String publishedDate;

	@SerializedName("updated")
	private String updated;

	@SerializedName("section")
	private String section;

	@SerializedName("subsection")
	private String subsection;

	@SerializedName("nytdsection")
	private String nytdsection;

	@SerializedName("adx_keywords")
	private String adxKeywords;

	@SerializedName("byline")
	private String byline;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("abstract")
	private String briefSummary;

	@SerializedName("media")
	private List<MediaItem> media;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAssetId() {
		return assetId;
	}

	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSubsection() {
		return subsection;
	}

	public void setSubsection(String subsection) {
		this.subsection = subsection;
	}

	public String getNytdsection() {
		return nytdsection;
	}

	public void setNytdsection(String nytdsection) {
		this.nytdsection = nytdsection;
	}

	public String getAdxKeywords() {
		return adxKeywords;
	}

	public void setAdxKeywords(String adxKeywords) {
		this.adxKeywords = adxKeywords;
	}

	public String getByline() {
		return byline;
	}

	public void setByline(String byline) {
		this.byline = byline;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBriefSummary() {
		return briefSummary;
	}

	public void setBriefSummary(String briefSummary) {
		this.briefSummary = briefSummary;
	}

	public List<MediaItem> getMedia() {
		return media;
	}

	public void setMedia(List<MediaItem> media) {
		this.media = media;
	}

	@Override
 	public String toString(){
		return
			"ResultsItem{" +
			",section = '" + section + '\'' +
			",asset_id = '" + assetId + '\'' +
			",source = '" + source + '\'' +
			",abstract = '" + briefSummary + '\'' +
			",media = '" + media + '\'' +
			",type = '" + type + '\'' +
			",title = '" + title + '\'' +
			",uri = '" + uri + '\'' +
			",url = '" + url + '\'' +
			",adx_keywords = '" + adxKeywords + '\'' +
			",id = '" + id + '\'' +
			",published_date = '" + publishedDate + '\'' +
			",updated = '" + updated + '\'' +
			",byline = '" + byline + '\'' +
			"}";
		}
}