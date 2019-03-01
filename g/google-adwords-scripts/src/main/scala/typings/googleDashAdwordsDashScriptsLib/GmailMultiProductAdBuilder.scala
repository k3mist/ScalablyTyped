package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailMultiProductAdBuilder[GmailMultiProductAd] extends AdBuilder[GmailMultiProductAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withContent(content: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withDescription(description: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeader(header: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadline(headline: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadlineColor(headlineColor: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonCallsToAction(itemCallsToAction: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalMobileUrls(itemButtonFinalMobileUrls: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalUrls(itemButtonFinalUrls: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonTrackingTemplates(itemButtonTrackingTemplates: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemImages(itemImages: js.Array[Media]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemTitle(itemTitles: js.Array[java.lang.String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withLogo(logo: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withName(name: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withSubject(subject: java.lang.String): GmailMultiProductAdBuilder[GmailMultiProductAd]
}

object GmailMultiProductAdBuilder {
  @scala.inline
  def apply[GmailMultiProductAd](
    build: js.Function0[AdWordsOperation[GmailMultiProductAdBuilder[GmailImageAd]]],
    withAdvertiser: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withContent: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withCustomParameters: js.Function1[js.Object, GmailMultiProductAdBuilder[GmailImageAd]],
    withDescription: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withFinalUrl: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailImageAd]],
    withHeader: js.Function1[Media, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withHeadline: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withHeadlineColor: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonCallsToAction: js.Function1[js.Array[java.lang.String], GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonFinalMobileUrls: js.Function1[js.Array[java.lang.String], GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonFinalUrls: js.Function1[js.Array[java.lang.String], GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemButtonTrackingTemplates: js.Function1[js.Array[java.lang.String], GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemImages: js.Function1[js.Array[Media], GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withItemTitle: js.Function1[js.Array[java.lang.String], GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withLogo: js.Function1[Media, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withMobileFinalUrl: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailImageAd]],
    withName: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withSubject: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailMultiProductAd]],
    withTrackingTemplate: js.Function1[java.lang.String, GmailMultiProductAdBuilder[GmailImageAd]]
  ): GmailMultiProductAdBuilder[GmailMultiProductAd] = {
    val __obj = js.Dynamic.literal(build = build, withAdvertiser = withAdvertiser, withContent = withContent, withCustomParameters = withCustomParameters, withDescription = withDescription, withFinalUrl = withFinalUrl, withHeader = withHeader, withHeadline = withHeadline, withHeadlineColor = withHeadlineColor, withItemButtonCallsToAction = withItemButtonCallsToAction, withItemButtonFinalMobileUrls = withItemButtonFinalMobileUrls, withItemButtonFinalUrls = withItemButtonFinalUrls, withItemButtonTrackingTemplates = withItemButtonTrackingTemplates, withItemImages = withItemImages, withItemTitle = withItemTitle, withLogo = withLogo, withMobileFinalUrl = withMobileFinalUrl, withName = withName, withSubject = withSubject, withTrackingTemplate = withTrackingTemplate)
  
    __obj.asInstanceOf[GmailMultiProductAdBuilder[GmailMultiProductAd]]
  }
}

