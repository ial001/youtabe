// ฟังก์ชันควบคุมปุ่ม Hamburger เมนูด้านข้าง (ย่อ/ขยาย Sidebar)
const menuToggle = document.getElementById('menu-toggle');
const sidebar = document.getElementById('sidebar');

if (menuToggle) {
    menuToggle.addEventListener('click', () => {
        sidebar.classList.toggle('collapsed');
    });
}

// ฟังก์ชันสลับสถานะปุ่ม Tag หมวดหมู่
const tags = document.querySelectorAll('.filter-tags .tag');

tags.forEach(tag => {
    tag.addEventListener('click', () => {
        // เอาคลาส active ออกจากปุ่มอื่นทั้งหมด
        tags.forEach(t => t.classList.remove('active'));
        // ใส่คลาส active ให้ปุ่มที่ถูกคลิก
        tag.classList.add('active');
    });
});
