/*****************************************
 * Quelltexte zum Buch: Praxisbuch Wicket
 * (http://www.hanser.de/978-3-446-41909-4)
 * 
 * Autor: Michael Mosmann
 * (michael@mosmann.de)
 *****************************************/
package de.wicketpraxis.web.thema.komponenten.basis.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.http.handler.RedirectRequestHandler;

import de.wicketpraxis.web.thema.TitleAnnotation;

@TitleAnnotation(title = "Redirect per Http (Temporary)")
public class RedirectHttpTemporaryPage extends WebPage {

	public RedirectHttpTemporaryPage() {
		getRequestCycle().scheduleRequestHandlerAfterCurrent(new RedirectRequestHandler("http://www.google.de"));
	}

}
