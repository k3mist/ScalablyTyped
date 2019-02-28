package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MochaNs {
  /**
    * Async callback function used for tests and hooks.
    */
  type AsyncFunc = js.ThisFunction0[/* this */ Context, js.Thenable[js.Any]]
  type Done = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  /**
    * Callback function used for tests and hooks.
    */
  type Func = js.ThisFunction1[/* this */ Context, /* done */ Done, scala.Unit]
  /** @deprecated use `Mocha.Stats` instead. */
  type IStats = Stats
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites. Indicates this suite should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @returns [bdd] `Suite`
    * @returns [tdd] `void`
    */
  type PendingSuiteFunction = js.Function2[
    /* title */ java.lang.String, 
    /* fn */ js.ThisFunction0[/* this */ Suite, scala.Unit], 
    Suite | scala.Unit
  ]
  type TestInterface = js.Function1[/* suite */ Suite, scala.Unit]
}
