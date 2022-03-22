package com.Dwipa.myrecyclerview;

import java.util.ArrayList;

class DataBuku {
    private static String[] NamaBuku = {
            "Buku After Efek",
            "Buku basis Data",
            "Buku C++",
            "Buku Corel Draw",
            "Buku Machine Learning",
            "Buku Metode Numerik",
            "Buku Pemrograman Web PHP",
            "Buku Pemrograman Web",
            "Buku Sosial Media & Sosial Network",
            "Buku Viral Digital Marketing"
    };

    private static String[] AboutBuku = {
            "Buku after efek untuk belajar tentang after efek.",
            "Buku basis data untuk belajar tentang basis data.",
            "Buku c++ untuk belajar pemrograman bahasas c++.",
            "Buku corel draw untuk belajar tentang penggunaan aplikasi corel draw. ",
            "Buku machine learning untuk belajar tentang machine learning.",
            "Buku metode numerik untuk belajar mengenai metode numerik.",
            "Buku pemrograman web php untuk belajar pemrograman web dengan php.",
            "Buku pemrograman web untuk belajar tentang pemrograman web.",
            "Buku sosial media & sosial network untuk belajar mengenai sosial media dan sosial network.",
            "Buku viral digital marketing untuk belajar mengenai digital marketing."
    };

    private static int[] GambarBuku = {
            R.drawable.after_efek,
            R.drawable.basis_data,
            R.drawable.cplus,
            R.drawable.corel_draw,
            R.drawable.machine_learning,
            R.drawable.metode_numerik,
            R.drawable.web_php,
            R.drawable.pemrograman_web,
            R.drawable.sosial,
            R.drawable.digital_marketing
    };

    static ArrayList<Buku> getListData() {
        ArrayList<Buku> list = new ArrayList<>();
        for (int position = 0; position < NamaBuku.length; position++) {
            Buku buku = new Buku();
            buku.setName(NamaBuku[position]);
            buku.setDetail(AboutBuku[position]);
            buku.setPhoto(GambarBuku[position]);
            list.add(buku);
        }
        return list;
    }
}