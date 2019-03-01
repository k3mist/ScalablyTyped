package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryMailSection extends js.Object {
  var htmlContent: java.lang.String
  var rank: scala.Double
  var sectionType: MailSectionType
  var title: java.lang.String
}

object SummaryMailSection {
  @scala.inline
  def apply(
    htmlContent: java.lang.String,
    rank: scala.Double,
    sectionType: MailSectionType,
    title: java.lang.String
  ): SummaryMailSection = {
    val __obj = js.Dynamic.literal(htmlContent = htmlContent, rank = rank, sectionType = sectionType, title = title)
  
    __obj.asInstanceOf[SummaryMailSection]
  }
}

