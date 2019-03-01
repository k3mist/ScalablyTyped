package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardSelectingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selecting card index value.
    */
  var cardIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selecting cell index value.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selecting cell element
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the current item.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** Returns added data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selecting the card element
    */
  var previousCard: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously rowcell is selecting card indexes
    */
  var previousRowcellindex: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CardSelectingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cardIndex: scala.Int | scala.Double = null,
    cellIndex: scala.Int | scala.Double = null,
    currentCell: js.Any = null,
    currentTarget: js.Any = null,
    data: js.Any = null,
    model: js.Any = null,
    previousCard: js.Any = null,
    previousRowcellindex: js.Array[_] = null,
    `type`: java.lang.String = null
  ): CardSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cardIndex != null) __obj.updateDynamic("cardIndex")(cardIndex.asInstanceOf[js.Any])
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousCard != null) __obj.updateDynamic("previousCard")(previousCard)
    if (previousRowcellindex != null) __obj.updateDynamic("previousRowcellindex")(previousRowcellindex)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CardSelectingEventArgs]
  }
}

