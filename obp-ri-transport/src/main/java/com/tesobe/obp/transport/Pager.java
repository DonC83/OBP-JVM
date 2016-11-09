/*
 * Copyright (c) TESOBE Ltd.  2016. All rights reserved.
 *
 * Use of this source code is governed by a GNU AFFERO license that can be found in the LICENSE file.
 *
 */
package com.tesobe.obp.transport;

public interface Pager
{
  boolean hasMorePages();

  Pager nextPage();

  enum SortField // todo rm!
  {
    completed, description, otherAccount, otherId, posted, type, value
  }

  enum SortOrder
  {
    ascending, descending, source
  }
}