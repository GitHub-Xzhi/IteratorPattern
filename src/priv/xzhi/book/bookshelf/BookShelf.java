package priv.xzhi.book.bookshelf;

import priv.xzhi.book.Aggregate;
import priv.xzhi.book.Book;
import priv.xzhi.book.Iterator;

/**
 * Description:书架
 * Created by Xzhi on 2018/12/6 11:37.
 */

public class BookShelf implements Aggregate
{
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize)
    {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index)
    {
        return books[index];
    }

    public void appendBook(Book book)
    {
        this.books[last] = book;
        last++;
    }

    public int getLength()
    {
        return last;
    }
    public Iterator iterator()
    {
        return new BookShelfIteratorImpl();
    }
}
