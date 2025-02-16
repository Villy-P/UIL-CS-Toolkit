<script lang="ts">
    let { text, href }: {
        text: string;
        href: string;
    } = $props();
</script>

<a class="bg-transparent px-5 py-2 rounded-lg hover:underline w-fit shadow-black shadow" {href}>{text}</a>