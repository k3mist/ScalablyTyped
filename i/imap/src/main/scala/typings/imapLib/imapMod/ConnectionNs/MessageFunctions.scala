package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFunctions extends js.Object {
  /** Adds flag(s) to message(s). */
  def addFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit
  /** Adds keyword(s) to message(s). keywords is either a single keyword or an array of keywords. */
  def addKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit
  /** Copies message(s) in the currently open mailbox to another mailbox. */
  def copy(
    source: js.Any,
    mailboxName: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit
  /** Removes flag(s) from message(s). */
  def delFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit
  /** Removes keyword(s) from message(s). keywords is either a single keyword or an array of keywords. */
  def delKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit
  /** Fetches message(s) in the currently open mailbox; source can be a single message identifier, a message identifier range (e.g. '2504:2507' or '*' or '2504:*'), an array of message identifiers, or an array of message identifier ranges. */
  def fetch(source: js.Any, options: FetchOptions): ImapFetch
  /** Moves message(s) in the currently open mailbox to another mailbox. Note: The message(s) in the destination mailbox will have a new message UID. */
  def move(
    source: js.Any,
    mailboxName: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit
  /** Searches the currently open mailbox for messages using given criteria. criteria is a list describing what you want to find. For criteria types that require arguments, use an array instead of just the string criteria type name (e.g. ['FROM', 'foo@bar.com']). Prefix criteria types with an "!" to negate.
    The following message flags are valid types that do not have arguments:
    ALL:            void;    // All messages.
    ANSWERED:       void;    // Messages with the Answered flag set.
    DELETED:        void;    // Messages with the Deleted flag set.
    DRAFT:          void;    // Messages with the Draft flag set.
    FLAGGED:        void;    // Messages with the Flagged flag set.
    NEW:            void;    // Messages that have the Recent flag set but not the Seen flag.
    SEEN:           void;    // Messages that have the Seen flag set.
    RECENT:         void;    // Messages that have the Recent flag set.
    OLD:            void;    // Messages that do not have the Recent flag set. This is functionally equivalent to "!RECENT" (as opposed to "!NEW").
    UNANSWERED:     void;    // Messages that do not have the Answered flag set.
    UNDELETED:      void;    // Messages that do not have the Deleted flag set.
    UNDRAFT:        void;    // Messages that do not have the Draft flag set.
    UNFLAGGED:      void;    // Messages that do not have the Flagged flag set.
    UNSEEN:         void;    // Messages that do not have the Seen flag set.
    The following are valid types that require string value(s):
    BCC:            any;    // Messages that contain the specified string in the BCC field.
    CC:             any;    // Messages that contain the specified string in the CC field.
    FROM:           any;    // Messages that contain the specified string in the FROM field.
    SUBJECT:        any;    // Messages that contain the specified string in the SUBJECT field.
    TO:             any;    // Messages that contain the specified string in the TO field.
    BODY:           any;    // Messages that contain the specified string in the message body.
    TEXT:           any;    // Messages that contain the specified string in the header OR the message body.
    KEYWORD:        any;    // Messages with the specified keyword set.
    HEADER:         any;    // Requires two string values, with the first being the header name and the second being the value to search for. If this second string is empty, all messages that contain the given header name will be returned.
    The following are valid types that require a string parseable by JavaScripts Date object OR a Date instance:
    BEFORE:         any;    // Messages whose internal date (disregarding time and timezone) is earlier than the specified date.
    ON:             any;    // Messages whose internal date (disregarding time and timezone) is within the specified date.
    SINCE:          any;    // Messages whose internal date (disregarding time and timezone) is within or later than the specified date.
    SENTBEFORE:     any;    // Messages whose Date header (disregarding time and timezone) is earlier than the specified date.
    SENTON:         any;    // Messages whose Date header (disregarding time and timezone) is within the specified date.
    SENTSINCE:      any;    // Messages whose Date header (disregarding time and timezone) is within or later than the specified date.
    The following are valid types that require one Integer value:
    LARGER:         number;    // Messages with a size larger than the specified number of bytes.
    SMALLER:        number;    // Messages with a size smaller than the specified number of bytes.
    The following are valid criterion that require one or more Integer values:
    UID:            any;    // Messages with UIDs corresponding to the specified UID set. Ranges are permitted (e.g. '2504:2507' or '*' or '2504:*').
    */
  def search(
    criteria: js.Array[_],
    callback: js.Function2[/* error */ nodeLib.Error, /* uids */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit
  /** Checks if the server supports the specified capability. */
  def serverSupports(capability: java.lang.String): scala.Boolean
  /** Sets the flag(s) for message(s). */
  def setFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit
  /** Sets keyword(s) for message(s). keywords is either a single keyword or an array of keywords. */
  def setKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit
}

object MessageFunctions {
  @scala.inline
  def apply(
    addFlags: js.Function3[js.Any, js.Any, js.Function1[/* error */ nodeLib.Error, scala.Unit], scala.Unit],
    addKeywords: js.Function3[js.Any, js.Any, js.Function1[/* error */ nodeLib.Error, scala.Unit], scala.Unit],
    copy: js.Function3[
      js.Any, 
      java.lang.String, 
      js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ],
    delFlags: js.Function3[js.Any, js.Any, js.Function1[/* error */ nodeLib.Error, scala.Unit], scala.Unit],
    delKeywords: js.Function3[js.Any, js.Any, js.Function1[/* error */ nodeLib.Error, scala.Unit], scala.Unit],
    fetch: js.Function2[js.Any, FetchOptions, ImapFetch],
    move: js.Function3[
      js.Any, 
      java.lang.String, 
      js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ],
    search: js.Function2[
      js.Array[_], 
      js.Function2[/* error */ nodeLib.Error, /* uids */ js.Array[scala.Double], scala.Unit], 
      scala.Unit
    ],
    serverSupports: js.Function1[java.lang.String, scala.Boolean],
    setFlags: js.Function3[js.Any, js.Any, js.Function1[/* error */ nodeLib.Error, scala.Unit], scala.Unit],
    setKeywords: js.Function3[js.Any, js.Any, js.Function1[/* error */ nodeLib.Error, scala.Unit], scala.Unit]
  ): MessageFunctions = {
    val __obj = js.Dynamic.literal(addFlags = addFlags, addKeywords = addKeywords, copy = copy, delFlags = delFlags, delKeywords = delKeywords, fetch = fetch, move = move, search = search, serverSupports = serverSupports, setFlags = setFlags, setKeywords = setKeywords)
  
    __obj.asInstanceOf[MessageFunctions]
  }
}

