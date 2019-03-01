package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentDescription extends js.Object {
  var comment: java.lang.String
  var description: java.lang.String
  var flowRoot: java.lang.String
  var hasError: java.lang.String
  var indent: scala.Double
  var mainRoot: java.lang.String
  var required: java.lang.String
  var title: java.lang.String
  var titleLeftRoot: java.lang.String
  var titleRequired: java.lang.String
}

object Anon_CommentDescription {
  @scala.inline
  def apply(
    comment: java.lang.String,
    description: java.lang.String,
    flowRoot: java.lang.String,
    hasError: java.lang.String,
    indent: scala.Double,
    mainRoot: java.lang.String,
    required: java.lang.String,
    title: java.lang.String,
    titleLeftRoot: java.lang.String,
    titleRequired: java.lang.String
  ): Anon_CommentDescription = {
    val __obj = js.Dynamic.literal(comment = comment, description = description, flowRoot = flowRoot, hasError = hasError, indent = indent, mainRoot = mainRoot, required = required, title = title, titleLeftRoot = titleLeftRoot, titleRequired = titleRequired)
  
    __obj.asInstanceOf[Anon_CommentDescription]
  }
}

