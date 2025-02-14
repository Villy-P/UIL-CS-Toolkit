<script lang="ts">
    let { text, href }: {
        text: string;
        href: string;
    } = $props();
</script>

<a class="bg-black text-white px-5 py-2 rounded-lg hover:bg-gray-950 w-fit shadow" {href}>{text}</a>