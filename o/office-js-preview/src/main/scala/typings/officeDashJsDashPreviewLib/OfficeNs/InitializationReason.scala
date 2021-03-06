package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InitializationReason extends js.Object

/**
  * Specifies whether the add-in was just inserted or was already contained in the document.
  *
  * @remarks
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this enumeration is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this enumeration.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
  *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
  *  </table>
  */
@JSGlobal("Office.InitializationReason")
@js.native
object InitializationReason extends js.Object {
  /**
    * The add-in is already part of the document that was opened.
    */
  @js.native
  sealed trait DocumentOpened
    extends officeDashJsDashPreviewLib.OfficeNs.InitializationReason
  
  /**
    * The add-in was just inserted into the document.
    */
  @js.native
  sealed trait Inserted
    extends officeDashJsDashPreviewLib.OfficeNs.InitializationReason
  
  val DocumentOpened: DocumentOpened with java.lang.String = js.native
  val Inserted: Inserted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.InitializationReason with java.lang.String] = js.native
}

