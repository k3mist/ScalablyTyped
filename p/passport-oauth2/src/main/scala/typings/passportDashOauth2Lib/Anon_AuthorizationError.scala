package typings
package passportDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationError extends js.Object {
  var AuthorizationError: org.scalablytyped.runtime.Instantiable4[
    /* message */ js.UndefOr[java.lang.String], 
    /* code */ java.lang.String, 
    /* uri */ js.UndefOr[/* uri */ java.lang.String], 
    /* status */ js.UndefOr[/* status */ scala.Double], 
    passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.AuthorizationError
  ]
  var InternalOAuthError: org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* err */ js.Any, 
    passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.InternalOAuthError
  ]
  var TokenError: org.scalablytyped.runtime.Instantiable4[
    /* message */ js.UndefOr[java.lang.String], 
    /* code */ java.lang.String, 
    /* uri */ js.UndefOr[/* uri */ java.lang.String], 
    /* status */ js.UndefOr[/* status */ scala.Double], 
    passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.TokenError
  ]
}

object Anon_AuthorizationError {
  @scala.inline
  def apply(
    AuthorizationError: org.scalablytyped.runtime.Instantiable4[
      /* message */ js.UndefOr[java.lang.String], 
      /* code */ java.lang.String, 
      /* uri */ js.UndefOr[/* uri */ java.lang.String], 
      /* status */ js.UndefOr[/* status */ scala.Double], 
      passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.AuthorizationError
    ],
    InternalOAuthError: org.scalablytyped.runtime.Instantiable2[
      /* message */ java.lang.String, 
      /* err */ js.Any, 
      passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.InternalOAuthError
    ],
    TokenError: org.scalablytyped.runtime.Instantiable4[
      /* message */ js.UndefOr[java.lang.String], 
      /* code */ java.lang.String, 
      /* uri */ js.UndefOr[/* uri */ java.lang.String], 
      /* status */ js.UndefOr[/* status */ scala.Double], 
      passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.TokenError
    ]
  ): Anon_AuthorizationError = {
    val __obj = js.Dynamic.literal(AuthorizationError = AuthorizationError, InternalOAuthError = InternalOAuthError, TokenError = TokenError)
  
    __obj.asInstanceOf[Anon_AuthorizationError]
  }
}

