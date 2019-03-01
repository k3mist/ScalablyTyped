package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def getUser(
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    next: expressLib.expressMod.eNs.NextFunction
  ): js.Promise[Principal]
}

object AuthProvider {
  @scala.inline
  def apply(
    getUser: js.Function3[
      expressLib.expressMod.eNs.Request, 
      expressLib.expressMod.eNs.Response, 
      expressLib.expressMod.eNs.NextFunction, 
      js.Promise[Principal]
    ]
  ): AuthProvider = {
    val __obj = js.Dynamic.literal(getUser = getUser)
  
    __obj.asInstanceOf[AuthProvider]
  }
}

