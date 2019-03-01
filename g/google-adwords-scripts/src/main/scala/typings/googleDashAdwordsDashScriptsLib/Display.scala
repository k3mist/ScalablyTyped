package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Display extends js.Object {
  def audiences(): AdWordsSelector[Audience]
  def keywords(): AdWordsSelector[DisplayKeyword]
  def placements(): AdWordsSelector[Placement]
  def topics(): AdWordsSelector[Topic]
}

object Display {
  @scala.inline
  def apply(
    audiences: js.Function0[AdWordsSelector[Audience]],
    keywords: js.Function0[AdWordsSelector[DisplayKeyword]],
    placements: js.Function0[AdWordsSelector[Placement]],
    topics: js.Function0[AdWordsSelector[Topic]]
  ): Display = {
    val __obj = js.Dynamic.literal(audiences = audiences, keywords = keywords, placements = placements, topics = topics)
  
    __obj.asInstanceOf[Display]
  }
}

