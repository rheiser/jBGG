package org.kerf.bgg.command;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.kerf.bgg.jaxb.Boardgames;

public class BoardgameCommand extends Command {

	Boolean comments;
	String gameId;
	Boolean stats;
	Boolean historical;
	Date from;
	Date to;

	public BoardgameCommand() {
		command = "boardgame";
	}

	protected String getArguments() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		String retval = "/" + getGameId() + "?comments=" + getComments();
		retval += "&stats=" + getStats();
		retval += "&historical=" + getHistorical();
		retval += "&from=" + formatter.format(getFrom());
		retval += "&to=" + formatter.format(getTo());

		return retval;
	}

	protected Class getReturnType() {
		return Boardgames.class;
	}

	public Boolean getComments() {
		return comments;
	}

	public void setComments(Boolean comments) {
		this.comments = comments;
	}

	public Boolean getStats() {
		return stats;
	}

	public void setStats(Boolean stats) {
		this.stats = stats;
	}

	public Boolean getHistorical() {
		return historical;
	}

	public void setHistorical(Boolean historical) {
		this.historical = historical;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

}
