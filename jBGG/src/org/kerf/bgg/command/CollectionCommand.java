package org.kerf.bgg.command;

import org.kerf.bgg.jaxb.Items;

public class CollectionCommand extends Command {


   public CollectionCommand(String username) {
		command = "collection";
		
		parameters.put("username", username);
	}


	@Override
	protected Class getReturnType() {
		return Items.class;
	}

	public String getOwn() {
		return parameters.getProperty("own");
	}

	public void setOwn(Boolean own) {
		parameters.setProperty("own", convertBoolean(own));
	}

	public String getRated() {
		return parameters.getProperty("rated");
	}

	public void setRated(Boolean rated) {
		parameters.setProperty("rated", convertBoolean(rated));
	}

	public String getPlayed() {
		return parameters.getProperty("played");
	}

	public void setPlayed(Boolean played) {
		parameters.setProperty("played", convertBoolean(played));
	}

	public String getComment() {
		return parameters.getProperty("comment");
	}

	public void setComment(Boolean comment) {
		parameters.setProperty("comment", convertBoolean(comment));
	}

	public String getTrade() {
		return parameters.getProperty("trade");
	}

	public void setTrade(Boolean trade) {
		parameters.setProperty("trade", convertBoolean(trade));
	}

	public String getWant() {
		return parameters.getProperty("want");
	}

	public void setWant(Boolean want) {
		parameters.setProperty("want", convertBoolean(want));
	}

	public String getWishlist() {
		return parameters.getProperty("wishlist");
	}

	public void setWishlist(Boolean wishlist) {
		parameters.setProperty("wishlist", convertBoolean(wishlist));
	}

	public String getWanttoplay() {
		return parameters.getProperty("wanttoplay");
	}

	public void setWanttoplay(Boolean wanttoplay) {
		parameters.setProperty("wanttoplay", convertBoolean(wanttoplay));
	}

	public String getWanttobuy() {
		return parameters.getProperty("wanttobuy");
	}

	public void setWanttobuy(Boolean wanttobuy) {
		parameters.setProperty("wanttobuy", convertBoolean(wanttobuy));
	}

	public String getPrevowned() {
		return parameters.getProperty("prevowned");
	}

	public void setPrevowned(Boolean prevowned) {
		parameters.setProperty("prevowned", convertBoolean(prevowned));
	}

	public String getPreordered() {
		return parameters.getProperty("preordered");
	}

	public void setPreordered(Boolean preordered) {
		parameters.setProperty("preordered", convertBoolean(preordered));
	}

	public String getHasparts() {
		return parameters.getProperty("hasparts");
	}

	public void setHasparts(Boolean hasparts) {
		parameters.setProperty("hasparts", convertBoolean(hasparts));
	}

	public String getWantparts() {
		return parameters.getProperty("wantparts");
	}

	public void setWantparts(Boolean wantparts) {
		parameters.setProperty("wantparts", convertBoolean(wantparts));
	}

	public String getNotifycontent() {
		return parameters.getProperty("notifycontent");
	}

	public void setNotifycontent(Boolean notifycontent) {
		parameters.setProperty("notifycontent", convertBoolean(notifycontent));
	}

	public String getNotifysale() {
		return parameters.getProperty("notifysale");
	}

	public void setNotifysale(Boolean notifysale) {
		parameters.setProperty("notifysale", convertBoolean(notifysale));
	}

	public String getNotifyauction() {
		return parameters.getProperty("notifyauction");
	}

	public void setNotifyauction(Boolean notifyauction) {
		parameters.setProperty("notifyauction", convertBoolean(notifyauction));
	}

	public String getWishlistpriority() {
		return parameters.getProperty("wishlistpriority");
	}

	public void setWishlistpriority(Integer wishlistpriority) {
		parameters.setProperty("wishlistpriority", wishlistpriority.toString());
	}

	public String getMinrating() {
		return parameters.getProperty("minrating");
	}

	public void setMinrating(Integer minrating) {
		parameters.setProperty("minrating", minrating.toString());
	}

	public String getMaxrating() {
		return parameters.getProperty("maxrating");
	}

	public void setMaxrating(Integer maxrating) {
		parameters.setProperty("maxrating", maxrating.toString());
	}

	public String getMinbggrating() {
		return parameters.getProperty("minbggrating");
	}

	public void setMinbggrating(Integer minbggrating) {
		parameters.setProperty("minbggrating", minbggrating.toString());
	}

	public String getMaxbggrating() {
		return parameters.getProperty("maxbggrating");
	}

	public void setMaxbggrating(Integer maxbggrating) {
		parameters.setProperty("maxbggrating", maxbggrating.toString());
	}

	public String getMinplays() {
		return parameters.getProperty("minplays");
	}

	public void setMinplays(Integer minplays) {
		parameters.setProperty("minplays", minplays.toString());
	}

	public String getMaxplays() {
		return parameters.getProperty("maxplays");
	}

	public void setMaxplays(Integer maxplays) {
		parameters.setProperty("maxplays", maxplays.toString());
	}

	public String getShowprivate() {
		return parameters.getProperty("showprivate");
	}

	public void setShowprivate(Boolean showprivate) {
		parameters.setProperty("showprivate", convertBoolean(showprivate));
	}

}
