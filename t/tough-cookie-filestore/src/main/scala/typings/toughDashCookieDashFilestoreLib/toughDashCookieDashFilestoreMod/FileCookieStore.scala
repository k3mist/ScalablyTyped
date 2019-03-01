package typings
package toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCookieStore extends js.Object {
  var filePath: java.lang.String
  var idx: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[
        toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie
      ]
    ]
  ]
  var synchronous: scala.Boolean
  def findCookie(
    domain: java.lang.String,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function2[
      /* whatever */ scala.Null, 
      /* cookie */ js.UndefOr[
        toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit
  def findCookies(
    domain: java.lang.String,
    path: java.lang.String,
    cb: js.Function2[
      /* whatever */ scala.Null, 
      /* cookies */ js.Array[
        toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie
      ], 
      scala.Unit
    ]
  ): scala.Unit
  def inspect(): java.lang.String
  def loadFromFile(filePath: java.lang.String, cb: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit
  def putCookie(
    cookie: toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function1[/* whatever */ scala.Null, scala.Unit]
  ): scala.Unit
  def removeCookie(
    domain: java.lang.String,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function1[/* whatever */ scala.Null, scala.Unit]
  ): scala.Unit
  def removeCookies(
    domain: java.lang.String,
    path: java.lang.String,
    cb: js.Function1[/* whatever */ scala.Null, scala.Unit]
  ): scala.Unit
  def saveToFile(filePath: java.lang.String, data: js.Any, cb: js.Function0[scala.Unit]): scala.Unit
  def updateCookie(
    oldCookie: toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie,
    newCookie: toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie,
    cb: js.Function1[/* whatever */ scala.Null, scala.Unit]
  ): scala.Unit
}

object FileCookieStore {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    findCookie: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      js.Function2[
        /* whatever */ scala.Null, 
        /* cookie */ js.UndefOr[
          toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie | scala.Null
        ], 
        scala.Unit
      ], 
      scala.Unit
    ],
    findCookies: js.Function3[
      java.lang.String, 
      java.lang.String, 
      js.Function2[
        /* whatever */ scala.Null, 
        /* cookies */ js.Array[
          toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie
        ], 
        scala.Unit
      ], 
      scala.Unit
    ],
    idx: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[
        org.scalablytyped.runtime.StringDictionary[
          toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie
        ]
      ]
    ],
    inspect: js.Function0[java.lang.String],
    loadFromFile: js.Function2[java.lang.String, js.Function1[/* data */ js.Any, scala.Unit], scala.Unit],
    putCookie: js.Function4[
      toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie, 
      java.lang.String, 
      java.lang.String, 
      js.Function1[/* whatever */ scala.Null, scala.Unit], 
      scala.Unit
    ],
    removeCookie: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      js.Function1[/* whatever */ scala.Null, scala.Unit], 
      scala.Unit
    ],
    removeCookies: js.Function3[
      java.lang.String, 
      java.lang.String, 
      js.Function1[/* whatever */ scala.Null, scala.Unit], 
      scala.Unit
    ],
    saveToFile: js.Function3[java.lang.String, js.Any, js.Function0[scala.Unit], scala.Unit],
    synchronous: scala.Boolean,
    updateCookie: js.Function3[
      toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie, 
      toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod.FileCookieStoreNs.Cookie, 
      js.Function1[/* whatever */ scala.Null, scala.Unit], 
      scala.Unit
    ]
  ): FileCookieStore = {
    val __obj = js.Dynamic.literal(filePath = filePath, findCookie = findCookie, findCookies = findCookies, idx = idx, inspect = inspect, loadFromFile = loadFromFile, putCookie = putCookie, removeCookie = removeCookie, removeCookies = removeCookies, saveToFile = saveToFile, synchronous = synchronous, updateCookie = updateCookie)
  
    __obj.asInstanceOf[FileCookieStore]
  }
}

