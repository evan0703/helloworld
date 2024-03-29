package com.shiyanlou.test_collection_demo;

import com.shiyanlou.test_collection_demo.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    /*
     * 用于存放学生的list
     */
    //集合后面的<>代表泛型的意思
    //泛型是规定了集合元素的类型
    //我们以后会详细讲到
    public  List<Student> students;

    public ListTest() {
        this.students = new ArrayList<Student>();
    }

    /*
     * 用于往students中添加学生
     */
    public void testAdd() {
        //创建一个学生对象，并通过调用add方法，添加到学生管理List中
        Student st1 = new Student("1", "张三");
        students.add(st1);

        //取出List中的Student对象
        Student temp = students.get(0);
        System.out.println("添加了学生：" + temp.id + ":" + temp.name);
        Student st2 = new Student("2", "李四");
        students.add(0,st2);
        Student temp2 = students.get(0);
        System.out.println("添加了学生：" + temp2.id + ":" + temp2.name);

        //对象数组的形式添加
        Student[] student = { new Student("3", "王五"), new Student("4", "马六")};

        //Arrays类包含用来操作数组（比如排序和搜索）的各种方法，asList()方法用来返回一个受指定数组支持的固定大小的列表
        students.addAll(Arrays.asList(student));
        Student temp3 = students.get(2);
        Student temp4 = students.get(3);
        System.out.println("添加了学生：" + temp3.id + ":" + temp3.name);
        System.out.println("添加了学生" + temp4.id + ":" + temp4.name);
        Student[] students2 = {new Student("5","周七"), new Student("6", "赵八")};
        students.addAll(2,Arrays.asList(students2));
        Student[] student2 = {new Student("5","周七"), new Student("6","赵八")};
        students.addAll(2,Arrays.asList(student2));
        Student temp5 = students.get(2);
        Student temp6 = students.get(3);
        System.out.println("添加了学生：" + temp5.id + "+" + temp5.name);
        System.out.println("添加了学生" + temp6.id + ":" + temp6.name);
    }

    /*
     *取得List中的元素的方法
     */
    public void testGet() {
        int size = students.size();
        for (int i = 0; i < size; i++) {
            Student st = students.get(i);
            System.out.println("学生：" + st.id + ":" + st.name);
        }
    }
/*
 *通过迭代器来遍历
 */
//迭代器的工作是遍历并选择序列中的对象，Java中Iterator只能单向移动

public void testIterator() {
    //通过集合的iterator方法，取得迭代器实例
    Iterator<Student> it = students.iterator();
    System.out.println("有如下学生（通过迭代器访问）：");
    while (it.hasNext()) {
        Student st = it.next();
        System.out.println("学生" + st.id + ":" + st.name);
    }
}

/**
 * 通过for each 方法访问集合元素
 *
 * @param args
 */
public void testForEach() {
    System.out.println("有如下学生（通过for each）：");
    for (Student obj : students) {
        Student st = obj;
        System.out.println("学生：" + st.id + ":" + st.name);
    }
}

/*
 *通过for each 方法访问集合元素
 *
 * @param args
 */
public void testModify() {
    students.set(4, new Student("3", "吴九"));
}

/**
 * 删除List中的元素
 *
 * @param args
 */
public void testRemove() {
    Student st = students.get(4);
    System.out.println("我是学生：" + st.id + ":" + st.name + "，我即将被删除");
    students.remove(st);
    System.out.println("成功删除学生！");
    testForEach();

}

public static void main(String[] args) {
    ListTest lt = new ListTest();
    lt.testAdd();
    lt.testGet();
    lt.testIterator();
    lt.testModify();
    lt.testForEach();
    lt.testRemove();
}
}
