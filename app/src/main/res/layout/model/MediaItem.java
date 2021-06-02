package com.example.mytask.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaItem{


	@SerializedName("media-metadata")
	private List<MediaMetadataItem> mediaMetadata;


	public void setMediaMetadata(List<MediaMetadataItem> mediaMetadata){
		this.mediaMetadata = mediaMetadata;
	}

	public List<MediaMetadataItem> getMediaMetadata(){
		return mediaMetadata;
	}


	@Override
 	public String toString(){
		return
			"MediaItem{" +
			",media-metadata = '" + mediaMetadata + '\'' +
			"}";
		}
}