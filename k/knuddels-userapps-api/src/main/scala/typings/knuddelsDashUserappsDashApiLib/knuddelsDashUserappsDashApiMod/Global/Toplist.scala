package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/Toplist.html
	 */
@JSGlobal("Toplist")
@js.native
class Toplist () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_addLabelChangeListener
  		 */
  def addLabelChangeListener(listener: js.Function1[/* labelChangeEvent */ ToplistLabelChangeEvent, scala.Unit]): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_addRankChangeListener
  		 */
  def addRankChangeListener(listener: js.Function1[/* rankChangeEvent */ ToplistRankChangeEvent, scala.Unit]): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getChatCommand
  		 */
  def getChatCommand(): java.lang.String = js.native
  def getChatCommand(user_or_userId: User): java.lang.String = js.native
  def getChatCommand(user_or_userId: scala.Double): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getDisplayName
  		 */
  def getDisplayName(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getLabel
  		 */
  def getLabel(user_or_userId: User): java.lang.String = js.native
  def getLabel(user_or_userId: scala.Double): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getUserPersistenceNumberKey
  		 */
  def getUserPersistenceNumberKey(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_removeLabelChangeListener
  		 */
  def removeLabelChangeListener(listener: js.Function1[/* labelChangeEvent */ ToplistLabelChangeEvent, scala.Unit]): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_removeRankChangeListener
  		 */
  def removeRankChangeListener(listener: js.Function1[/* rankChangeEvent */ ToplistRankChangeEvent, scala.Unit]): scala.Unit = js.native
}

