package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMoreOptions[TData, TVariables] extends js.Object {
  def updateQuery(previousQueryResult: TData, options: apolloDashClientLib.Anon_FetchMoreResult[TData, TVariables]): TData
}

object FetchMoreOptions {
  @scala.inline
  def apply[TData, TVariables](
    updateQuery: js.Function2[TData, apolloDashClientLib.Anon_FetchMoreResult[TData, TVariables], TData]
  ): FetchMoreOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(updateQuery = updateQuery)
  
    __obj.asInstanceOf[FetchMoreOptions[TData, TVariables]]
  }
}

