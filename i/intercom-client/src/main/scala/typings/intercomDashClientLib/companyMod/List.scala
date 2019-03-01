package typings
package intercomDashClientLib.companyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var companies: js.Array[Company with CompanyIdentifier]
  var pages: intercomDashClientLib.Anon_Next
  var total_count: scala.Double
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.companyDOTlist
}

object List {
  @scala.inline
  def apply(
    companies: js.Array[Company with CompanyIdentifier],
    pages: intercomDashClientLib.Anon_Next,
    total_count: scala.Double,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.companyDOTlist
  ): List = {
    val __obj = js.Dynamic.literal(companies = companies, pages = pages, total_count = total_count, `type` = `type`)
  
    __obj.asInstanceOf[List]
  }
}

